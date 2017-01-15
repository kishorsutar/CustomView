package com.kishor.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kishor on 15/1/17.
 */

public class CustomView extends View {

    boolean mShowText;
    Integer mTextPost;
    public CustomView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CustomView,0,0);
        try {
            mShowText = typedArray.getBoolean(R.styleable.CustomView_showText,false);
            mTextPost = typedArray.getInteger(R.styleable.CustomView_labelPosition,0);

        }finally {
            typedArray.recycle();
        }
    }

    public boolean isShowText(){

return  mShowText;
    }

    public void setShowText(boolean showText){
        mShowText = showText;
        invalidate();
        requestLayout();
    }

    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public CustomView(Context context) {
        super(context);
    }

    /**
     * This is called when the view is attached to a window.  At this point it
     * has a Surface and will start drawing.  Note that this function is
     * guaranteed to be called before {@link #onDraw(Canvas)},
     * however it may be called any time before the first onDraw -- including
     * before or after {@link #onMeasure(int, int)}.
     *
     * @see #onDetachedFromWindow()
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /**
     * <p>
     * Measure the view and its content to determine the measured width and the
     * measured height. This method is invoked by {@link #measure(int, int)} and
     * should be overridden by subclasses to provide accurate and efficient
     * measurement of their contents.
     * </p>
     * <p>
     * <p>
     * <strong>CONTRACT:</strong> When overriding this method, you
     * <em>must</em> call {@link #setMeasuredDimension(int, int)} to store the
     * measured width and height of this view. Failure to do so will trigger an
     * <code>IllegalStateException</code>, thrown by
     * {@link #measure(int, int)}. Calling the superclass'
     * {@link #onMeasure(int, int)} is a valid use.
     * </p>
     * <p>
     * <p>
     * The base class implementation of measure defaults to the background size,
     * unless a larger size is allowed by the MeasureSpec. Subclasses should
     * override {@link #onMeasure(int, int)} to provide better measurements of
     * their content.
     * </p>
     * <p>
     * <p>
     * If this method is overridden, it is the subclass's responsibility to make
     * sure the measured height and width are at least the view's minimum height
     * and width ({@link #getSuggestedMinimumHeight()} and
     * {@link #getSuggestedMinimumWidth()}).
     * </p>
     *
     * @param widthMeasureSpec  horizontal space requirements as imposed by the parent.
     *                          The requirements are encoded with
     *                          {@link MeasureSpec}.
     * @param heightMeasureSpec vertical space requirements as imposed by the parent.
     *                          The requirements are encoded with
     *                          {@link MeasureSpec}.
     * @see #getMeasuredWidth()
     * @see #getMeasuredHeight()
     * @see #setMeasuredDimension(int, int)
     * @see #getSuggestedMinimumHeight()
     * @see #getSuggestedMinimumWidth()
     * @see MeasureSpec#getMode(int)
     * @see MeasureSpec#getSize(int)
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /**
     * Called from layout when this view should
     * assign a size and position to each of its children.
     * <p>
     * Derived classes with children should override
     * this method and call layout on each of
     * their children.
     *
     * @param changed This is a new size or position for this view
     * @param left    Left position, relative to parent
     * @param top     Top position, relative to parent
     * @param right   Right position, relative to parent
     * @param bottom  Bottom position, relative to parent
     */
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    /**
     * This is called during layout when the size of this view has changed. If
     * you were just added to the view hierarchy, you're called with the old
     * values of 0.
     *
     * @param w    Current width of this view.
     * @param h    Current height of this view.
     * @param oldw Old width of this view.
     * @param oldh Old height of this view.
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    /**
     * Implement this to do your drawing.
     *
     * @param canvas the canvas on which the background will be drawn
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /**
     * Called by the view system when the focus state of this view changes.
     * When the focus change event is caused by directional navigation, direction
     * and previouslyFocusedRect provide insight into where the focus is coming from.
     * When overriding, be sure to call up through to the super class so that
     * the standard focus handling will occur.
     *
     * @param gainFocus             True if the View has focus; false otherwise.
     * @param direction             The direction focus has moved when requestFocus()
     *                              is called to give this view focus. Values are
     *                              {@link #FOCUS_UP}, {@link #FOCUS_DOWN}, {@link #FOCUS_LEFT},
     *                              {@link #FOCUS_RIGHT}, {@link #FOCUS_FORWARD}, or {@link #FOCUS_BACKWARD}.
     *                              It may not always apply, in which case use the default.
     * @param previouslyFocusedRect The rectangle, in this view's coordinate
     *                              system, of the previously focused view.  If applicable, this will be
     *                              passed in as finer grained information about where the focus is coming
     */
    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    /**
     * This is called when the view is detached from a window.  At this point it
     * no longer has a surface for drawing.
     *
     * @see #onAttachedToWindow()
     */
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}

