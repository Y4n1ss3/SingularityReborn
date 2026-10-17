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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WashKt {
    private static ImageVector _wash;

    public static final ImageVector getWash(Icons.Filled filled) {
        ImageVector imageVector = _wash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Wash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 8.0f);
        b.curveTo(19.88f, 8.0f, 21.0f, 6.88f, 21.0f, 5.5f);
        b.curveTo(21.0f, 3.83f, 18.5f, 1.0f, 18.5f, 1.0f);
        b.reflectiveCurveTo(16.0f, 3.83f, 16.0f, 5.5f);
        b.curveTo(16.0f, 6.88f, 17.12f, 8.0f, 18.5f, 8.0f);
        b.close();
        b.moveTo(13.5f, 9.0f);
        b.curveTo(14.33f, 9.0f, 15.0f, 8.33f, 15.0f, 7.5f);
        b.curveTo(15.0f, 6.66f, 13.5f, 5.0f, 13.5f, 5.0f);
        b.reflectiveCurveTo(12.0f, 6.66f, 12.0f, 7.5f);
        b.curveTo(12.0f, 8.33f, 12.67f, 9.0f, 13.5f, 9.0f);
        k4.x(b, 9.12f, 5.0f, -7.18f, 6.79f);
        b.curveTo(1.34f, 12.35f, 1.0f, 13.14f, 1.0f, 13.97f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.horizontalLineToRelative(6.25f);
        b.horizontalLineTo(12.0f);
        b.horizontalLineToRelative(5.75f);
        b.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        af0.u(b, 12.0f, -1.0f, 7.75f);
        b.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        af0.u(b, 12.0f, -1.0f, 8.75f);
        b.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        af0.u(b, 12.0f, -1.0f, 6.75f);
        b.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveTo(19.44f, 10.0f, 18.75f, 10.0f);
        b.horizontalLineTo(8.86f);
        b.curveToRelative(0.64f, -1.11f, 1.48f, -2.58f, 1.49f, -2.61f);
        b.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        b.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        b.curveTo(10.22f, 6.12f, 9.12f, 5.0f, 9.12f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 9.12f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wash = build;
        build.getClass();
        return build;
    }
}
