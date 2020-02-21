package edu.msu.lawsont2.madhatter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * The view we will draw out hatter in
 */
public class HatterView extends View {

    private class Parameters {
        /**
         * Path to the image file if one exists
         */
        public String imagePath = null;
    }

    /**
     * The current parameters
     */
    private Parameters params = new Parameters();

    /**
     * The image bitmap. None initially.
     */
    private Bitmap imageBitmap = null;

    public HatterView(Context context) {
        super(context);
        init(null, 0);
    }

    public HatterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public HatterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // If there is no image to draw, we do nothing
        if(imageBitmap == null) {
            return;
        }

        canvas.drawBitmap(imageBitmap, 0, 0, null);
    }


    /**
     * Get the installed image path
     * @return path or null if none
     */
    public String getImagePath() {
        return params.imagePath;
    }

    /**
     * Set an image path
     * @param imagePath path to image file
     */
    public void setImagePath(String imagePath) {
        params.imagePath = imagePath;

        imageBitmap = BitmapFactory.decodeFile(imagePath);
        invalidate();
    }

}