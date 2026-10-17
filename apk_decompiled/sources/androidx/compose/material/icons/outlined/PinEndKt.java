package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinEndKt {
    private static ImageVector _pinEnd;

    public static final ImageVector getPinEnd(Icons.Outlined outlined) {
        ImageVector imageVector = _pinEnd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PinEnd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(20.0f, 12.0f, 6.0f, 4.0f, 12.0f);
        r6.t(f, 10.0f, 0.0f, 2.0f, 4.0f);
        f.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        f.verticalLineTo(6.0f);
        f.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        f.horizontalLineToRelative(16.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        kf0.n(f, 6.0f, 20.0f, 19.0f, 14.0f);
        f.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        f.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        f.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        f.reflectiveCurveTo(20.66f, 14.0f, 19.0f, 14.0f);
        uo.q(f, 14.66f, 8.0f, 9.0f, 5.66f);
        bv.p(f, 2.0f, -2.24f, 2.95f, 2.95f);
        f.lineToRelative(1.41f, -1.41f);
        f.lineTo(12.41f, 10.0f);
        f.horizontalLineToRelative(2.24f);
        f.verticalLineTo(8.0f);
        f.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, f.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinEnd = build;
        build.getClass();
        return build;
    }
}
