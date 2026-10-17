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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinearScaleKt {
    private static ImageVector _linearScale;

    public static final ImageVector getLinearScale(Icons.Rounded rounded) {
        ImageVector imageVector = _linearScale;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LinearScale", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 7.0f);
        b.curveToRelative(-2.41f, 0.0f, -4.43f, 1.72f, -4.9f, 4.0f);
        b.horizontalLineTo(6.79f);
        b.curveTo(6.4f, 10.12f, 5.52f, 9.5f, 4.5f, 9.5f);
        b.curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        b.curveToRelative(1.02f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f);
        b.horizontalLineToRelative(5.31f);
        b.curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(19.76f, 7.0f, 17.0f, 7.0f);
        b.close();
        b.moveTo(17.0f, 15.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 18.65f, 15.0f, 17.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linearScale = build;
        build.getClass();
        return build;
    }
}
