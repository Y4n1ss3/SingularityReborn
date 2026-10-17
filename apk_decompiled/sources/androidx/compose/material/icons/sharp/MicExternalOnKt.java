package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicExternalOnKt {
    private static ImageVector _micExternalOn;

    public static final ImageVector getMicExternalOn(Icons.Sharp sharp) {
        ImageVector imageVector = _micExternalOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MicExternalOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(9.22f, 7.0f, 4.78f);
        d.curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f);
        d.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        d.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        d.curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f);
        uo.C(d, 20.0f, 2.0f, 20.0f, -2.0f);
        j50.B(d, 4.0f, -4.0f, 18.0f, 6.0f);
        d.curveToRelative(0.0f, 0.0f, 0.0f, -1.79f, 0.0f, -4.0f);
        d.horizontalLineTo(5.0f);
        d.lineTo(4.0f, 8.0f);
        d.horizontalLineToRelative(6.0f);
        r6.w(d, 9.0f, 18.0f, 8.0f, 2.0f);
        d.horizontalLineToRelative(4.0f);
        d.verticalLineTo(2.0f);
        d.horizontalLineTo(20.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micExternalOn = build;
        build.getClass();
        return build;
    }
}
