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
import defpackage.bv;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(Icons.Filled filled) {
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rocket", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.5f);
        b.curveToRelative(0.0f, 0.0f, 4.5f, 2.04f, 4.5f, 10.5f);
        b.curveToRelative(0.0f, 2.49f, -1.04f, 5.57f, -1.6f, 7.0f);
        b.horizontalLineTo(9.1f);
        b.curveToRelative(-0.56f, -1.43f, -1.6f, -4.51f, -1.6f, -7.0f);
        b.curveTo(7.5f, 4.54f, 12.0f, 2.5f, 12.0f, 2.5f);
        b.close();
        b.moveTo(14.0f, 11.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        b.close();
        b.moveTo(7.69f, 20.52f);
        b.curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f);
        b.lineToRelative(-1.13f, 0.75f);
        b.curveTo(4.33f, 14.78f, 4.0f, 15.4f, 4.0f, 16.07f);
        bv.k(b, 22.0f, 7.69f, 20.52f);
        b.moveTo(20.0f, 22.0f);
        b.verticalLineToRelative(-5.93f);
        b.curveToRelative(0.0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f);
        b.lineToRelative(-1.13f, -0.75f);
        b.curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocket = build;
        build.getClass();
        return build;
    }
}
