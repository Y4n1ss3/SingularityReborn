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
import defpackage.af0;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirKt {
    private static ImageVector _air;

    public static final ImageVector getAir(Icons.Outlined outlined) {
        ImageVector imageVector = _air;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Air", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.5f, 17.0f);
        b.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        af0.u(b, 2.0f, -2.0f, 9.5f);
        b.curveTo(13.15f, 14.0f, 14.5f, 15.35f, 14.5f, 17.0f);
        b.close();
        b.moveTo(19.0f, 6.5f);
        b.curveTo(19.0f, 4.57f, 17.43f, 3.0f, 15.5f, 3.0f);
        b.reflectiveCurveTo(12.0f, 4.57f, 12.0f, 6.5f);
        b.horizontalLineToRelative(2.0f);
        b.curveTo(14.0f, 5.67f, 14.67f, 5.0f, 15.5f, 5.0f);
        b.reflectiveCurveTo(17.0f, 5.67f, 17.0f, 6.5f);
        b.reflectiveCurveTo(16.33f, 8.0f, 15.5f, 8.0f);
        af0.u(b, 2.0f, 2.0f, 13.5f);
        b.curveTo(17.43f, 10.0f, 19.0f, 8.43f, 19.0f, 6.5f);
        uo.q(b, 18.5f, 11.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(16.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(19.33f, 16.0f, 18.5f, 16.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 20.43f, 11.0f, 18.5f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _air = build;
        build.getClass();
        return build;
    }
}
