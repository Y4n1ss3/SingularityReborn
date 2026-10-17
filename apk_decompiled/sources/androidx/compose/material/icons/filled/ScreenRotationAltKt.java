package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenRotationAltKt {
    private static ImageVector _screenRotationAlt;

    public static final ImageVector getScreenRotationAlt(Icons.Filled filled) {
        ImageVector imageVector = _screenRotationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScreenRotationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.0f, 7.59f, 5.0f, -5.0f);
        e.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        e.lineTo(20.24f, 11.0f);
        e.horizontalLineToRelative(-2.83f);
        e.lineTo(10.4f, 4.0f);
        r6.w(e, 5.41f, 9.0f, 8.0f, 2.0f);
        uo.o(e, 2.0f, 5.0f, 2.0f, 7.59f);
        k4.C(e, 20.0f, 19.0f, 2.0f, -6.0f);
        kf0.x(e, -6.0f, 2.0f, 2.59f);
        e.lineToRelative(-4.99f, 5.0f);
        e.lineToRelative(-7.01f, -7.0f);
        e.horizontalLineTo(3.76f);
        e.lineToRelative(8.41f, 8.41f);
        e.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(e, 5.0f, -5.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotationAlt = build;
        build.getClass();
        return build;
    }
}
