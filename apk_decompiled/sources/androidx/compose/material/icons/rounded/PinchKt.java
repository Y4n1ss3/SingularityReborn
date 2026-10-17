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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Rounded rounded) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pinch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.2f, 17.43f);
        b.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        b.lineTo(13.0f, 17.24f);
        b.verticalLineTo(6.5f);
        b.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        b.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        b.verticalLineToRelative(6.0f);
        b.horizontalLineToRelative(0.91f);
        b.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        b.lineToRelative(4.09f, 2.04f);
        b.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        b.lineToRelative(-0.63f, 4.46f);
        b.curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f);
        b.horizontalLineToRelative(-6.16f);
        b.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        b.lineToRelative(-4.07f, -4.29f);
        b.curveTo(8.3f, 17.94f, 8.2f, 17.69f, 8.2f, 17.43f);
        b.close();
        b.moveTo(9.5f, 5.25f);
        b.curveTo(9.5f, 5.66f, 9.84f, 6.0f, 10.25f, 6.0f);
        b.reflectiveCurveTo(11.0f, 5.66f, 11.0f, 5.25f);
        b.verticalLineTo(2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(6.75f);
        b.curveTo(6.34f, 1.0f, 6.0f, 1.34f, 6.0f, 1.75f);
        b.reflectiveCurveTo(6.34f, 2.5f, 6.75f, 2.5f);
        fc.s(b, 1.69f, 2.5f, 8.44f, 6.75f);
        b.curveTo(2.5f, 6.34f, 2.16f, 6.0f, 1.75f, 6.0f);
        b.reflectiveCurveTo(1.0f, 6.34f, 1.0f, 6.75f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.25f);
        b.curveTo(5.66f, 11.0f, 6.0f, 10.66f, 6.0f, 10.25f);
        b.reflectiveCurveTo(5.66f, 9.5f, 5.25f, 9.5f);
        b.horizontalLineTo(3.56f);
        b.lineTo(9.5f, 3.56f);
        b.verticalLineTo(5.25f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = build;
        build.getClass();
        return build;
    }
}
