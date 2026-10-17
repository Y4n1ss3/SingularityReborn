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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HikingKt {
    private static ImageVector _hiking;

    public static final ImageVector getHiking(Icons.Sharp sharp) {
        ImageVector imageVector = _hiking;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Hiking", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        b.close();
        b.moveTo(17.5f, 10.78f);
        b.curveToRelative(-1.23f, -0.37f, -2.22f, -1.17f, -2.8f, -2.18f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.41f, -0.65f, -1.11f, -1.0f, -1.84f, -1.0f);
        b.curveToRelative(-0.78f, 0.0f, -1.59f, 0.5f, -1.78f, 1.44f);
        b.reflectiveCurveTo(7.0f, 23.0f, 7.0f, 23.0f);
        b.horizontalLineToRelative(2.1f);
        b.lineToRelative(1.8f, -8.0f);
        r6.A(b, 2.1f, 2.0f, 6.0f, 2.0f);
        b.verticalLineToRelative(-7.5f);
        b.lineToRelative(-2.1f, -2.0f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.0f, 1.15f, 2.41f, 2.01f, 4.0f, 2.34f);
        uo.m(b, 23.0f, 19.0f, 9.0f, -1.5f);
        uo.l(b, 17.5f, 10.78f, 7.43f, 13.13f);
        b.lineToRelative(-3.1f, -0.6f);
        b.lineToRelative(1.34f, -6.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 3.13f, 0.61f, 7.43f, 13.13f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hiking = build;
        build.getClass();
        return build;
    }
}
