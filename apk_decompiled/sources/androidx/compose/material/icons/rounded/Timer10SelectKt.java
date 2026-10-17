package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Timer10SelectKt {
    private static ImageVector _timer10Select;

    public static final ImageVector getTimer10Select(Icons.Rounded rounded) {
        ImageVector imageVector = _timer10Select;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Timer10Select", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(13.0f, 8.0f, 8.0f, -3.0f, 8.0f);
        w.horizontalLineTo(13.0f);
        w.moveTo(13.0f, 5.0f);
        w.horizontalLineToRelative(-3.0f);
        w.curveTo(8.34f, 5.0f, 7.0f, 6.34f, 7.0f, 8.0f);
        w.verticalLineToRelative(8.0f);
        w.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        w.horizontalLineToRelative(3.0f);
        w.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        w.verticalLineTo(8.0f);
        w.curveTo(16.0f, 6.34f, 14.66f, 5.0f, 13.0f, 5.0f);
        uo.q(w, 2.5f, 8.0f, 3.0f, 9.5f);
        w.curveTo(3.0f, 18.33f, 3.67f, 19.0f, 4.5f, 19.0f);
        w.horizontalLineToRelative(0.0f);
        w.curveTo(5.33f, 19.0f, 6.0f, 18.33f, 6.0f, 17.5f);
        w.verticalLineTo(7.0f);
        w.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        w.horizontalLineTo(2.5f);
        w.curveTo(1.67f, 5.0f, 1.0f, 5.67f, 1.0f, 6.5f);
        w.verticalLineToRelative(0.0f);
        w.curveTo(1.0f, 7.33f, 1.67f, 8.0f, 2.5f, 8.0f);
        w.close();
        w.moveTo(18.5f, 11.0f);
        w.curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f);
        w.verticalLineToRelative(2.0f);
        w.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        af0.u(w, 21.0f, 1.0f, -3.0f);
        w.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        w.verticalLineToRelative(0.0f);
        w.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        w.horizontalLineToRelative(3.5f);
        w.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        w.verticalLineToRelative(-2.0f);
        w.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        af0.u(w, 19.0f, -1.0f, 3.0f);
        w.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        w.verticalLineToRelative(0.0f);
        w.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(w, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer10Select = build;
        build.getClass();
        return build;
    }
}
