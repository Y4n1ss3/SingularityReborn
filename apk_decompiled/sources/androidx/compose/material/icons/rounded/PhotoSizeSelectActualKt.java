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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoSizeSelectActualKt {
    private static ImageVector _photoSizeSelectActual;

    public static final ImageVector getPhotoSizeSelectActual(Icons.Rounded rounded) {
        ImageVector imageVector = _photoSizeSelectActual;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhotoSizeSelectActual", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 3.0f, 3.0f);
        d.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        k4.x(d, 5.63f, 16.19f, 2.49f, -3.2f);
        d.curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f);
        d.lineToRelative(2.1f, 2.53f);
        d.lineToRelative(3.1f, -3.99f);
        d.curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f);
        d.lineToRelative(3.51f, 4.68f);
        d.curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        d.horizontalLineTo(6.02f);
        d.curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectActual = build;
        build.getClass();
        return build;
    }
}
