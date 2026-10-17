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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.Rounded rounded) {
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ImageNotSupported", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.19f, 21.19f, -0.78f, -0.78f);
        e.lineTo(18.0f, 18.0f);
        e.lineToRelative(-4.59f, -4.59f);
        e.lineTo(3.59f, 3.59f);
        e.verticalLineToRelative(0.0f);
        e.lineTo(2.81f, 2.81f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
        e.lineTo(3.0f, 5.83f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(13.17f);
        e.lineToRelative(1.61f, 1.61f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.curveTo(21.58f, 22.22f, 21.58f, 21.58f, 21.19f, 21.19f);
        e.close();
        e.moveTo(6.02f, 18.0f);
        e.curveToRelative(-0.42f, 0.0f, -0.65f, -0.48f, -0.39f, -0.81f);
        e.lineToRelative(2.49f, -3.2f);
        e.curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f);
        e.lineToRelative(2.1f, 2.53f);
        e.lineTo(12.17f, 15.0f);
        gy.w(e, 3.0f, 3.0f, 6.02f);
        e.moveTo(21.0f, 18.17f);
        e.lineTo(5.83f, 3.0f);
        e.horizontalLineTo(19.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 18.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = build;
        build.getClass();
        return build;
    }
}
