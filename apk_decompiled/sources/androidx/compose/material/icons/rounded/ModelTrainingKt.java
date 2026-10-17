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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModelTrainingKt {
    private static ImageVector _modelTraining;

    public static final ImageVector getModelTraining(Icons.Rounded rounded) {
        ImageVector imageVector = _modelTraining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ModelTraining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 13.5f);
        b.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        b.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        b.horizontalLineToRelative(0.0f);
        b.curveTo(13.93f, 10.0f, 15.5f, 11.57f, 15.5f, 13.5f);
        af0.r(b, 13.0f, 19.5f, -2.0f, 20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        bv.t(b, 19.5f, 19.0f, 13.0f);
        b.curveToRelative(0.0f, 1.39f, -0.41f, 2.69f, -1.12f, 3.78f);
        b.curveToRelative(-0.25f, 0.39f, -0.19f, 0.91f, 0.14f, 1.24f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.44f, 0.44f, 1.2f, 0.38f, 1.54f, -0.15f);
        b.curveTo(20.47f, 16.47f, 21.0f, 14.8f, 21.0f, 13.0f);
        b.curveToRelative(0.0f, -2.36f, -0.91f, -4.51f, -2.4f, -6.12f);
        b.curveToRelative(-0.39f, -0.42f, -1.05f, -0.43f, -1.45f, -0.03f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, -0.02f, 1.39f);
        b.curveTo(18.29f, 9.49f, 19.0f, 11.16f, 19.0f, 13.0f);
        k4.x(b, 15.65f, 4.65f, -2.79f, -2.79f);
        b.curveTo(12.54f, 1.54f, 12.0f, 1.76f, 12.0f, 2.21f);
        b.verticalLineTo(4.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 1.8f, 0.53f, 3.47f, 1.44f, 4.88f);
        b.curveToRelative(0.34f, 0.53f, 1.1f, 0.59f, 1.54f, 0.15f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.33f, -0.33f, 0.39f, -0.84f, 0.14f, -1.23f);
        b.curveTo(4.73f, 14.65f, 4.48f, 11.7f, 6.25f, 8.8f);
        b.curveTo(7.45f, 6.85f, 9.71f, 5.81f, 12.0f, 6.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.verticalLineToRelative(1.79f);
        b.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        b.lineToRelative(2.79f, -2.79f);
        b.curveTo(15.84f, 5.16f, 15.84f, 4.84f, 15.65f, 4.65f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modelTraining = build;
        build.getClass();
        return build;
    }
}
