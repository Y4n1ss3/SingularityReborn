package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.dq;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        public final void setRadius(RippleDrawable rippleDrawable, int i) {
            rippleDrawable.setRadius(i);
        }
    }

    public UnprojectedRipple(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.bounded = z;
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m1590calculateRippleColor5vOe2sY(long j, float f) {
        return Color.m4760copywmQWz5c$default(j, f > 1.0f ? 1.0f : f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m1591setColorDxMtmZc(long j, float f) {
        long m1590calculateRippleColor5vOe2sY = m1590calculateRippleColor5vOe2sY(j, f);
        Color color = this.rippleColor;
        if (color == null ? false : Color.m4762equalsimpl0(color.m4771unboximpl(), m1590calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m4751boximpl(m1590calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m4815toArgb8_81llA(m1590calculateRippleColor5vOe2sY)));
    }

    public final void trySetRadius(int i) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i);
        MRadiusHelper.INSTANCE.setRadius(this, i);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
