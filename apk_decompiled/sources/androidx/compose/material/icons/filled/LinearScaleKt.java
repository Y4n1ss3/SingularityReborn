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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinearScaleKt {
    private static ImageVector _linearScale;

    public static final ImageVector getLinearScale(Icons.Filled filled) {
        ImageVector imageVector = _linearScale;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LinearScale", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.5f, 9.5f);
        b.curveToRelative(-1.03f, 0.0f, -1.9f, 0.62f, -2.29f, 1.5f);
        b.horizontalLineToRelative(-2.92f);
        b.curveTo(13.9f, 10.12f, 13.03f, 9.5f, 12.0f, 9.5f);
        b.reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f);
        b.horizontalLineTo(6.79f);
        b.curveTo(6.4f, 10.12f, 5.53f, 9.5f, 4.5f, 9.5f);
        b.curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        b.curveToRelative(1.03f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f);
        b.horizontalLineToRelative(2.92f);
        b.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        b.reflectiveCurveToRelative(1.9f, -0.62f, 2.29f, -1.5f);
        b.horizontalLineToRelative(2.92f);
        b.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 20.88f, 9.5f, 19.5f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linearScale = build;
        build.getClass();
        return build;
    }
}
