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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoFileKt {
    private static ImageVector _videoFile;

    public static final ImageVector getVideoFile(Icons.Rounded rounded) {
        ImageVector imageVector = _videoFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VideoFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.17f, 2.0f, 6.01f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        d.lineTo(4.0f, 20.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(8.83f);
        d.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        d.lineToRelative(-4.83f, -4.83f);
        d.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        bv.g(d, 13.0f, 8.0f, 3.5f);
        d.lineTo(18.5f, 9.0f);
        d.horizontalLineTo(14.0f);
        d.curveTo(13.45f, 9.0f, 13.0f, 8.55f, 13.0f, 8.0f);
        k4.x(d, 14.0f, 14.0f, 1.27f, -0.67f);
        d.curveTo(15.6f, 13.15f, 16.0f, 13.39f, 16.0f, 13.77f);
        d.verticalLineToRelative(2.46f);
        d.curveToRelative(0.0f, 0.38f, -0.4f, 0.62f, -0.73f, 0.44f);
        d.lineTo(14.0f, 16.0f);
        d.verticalLineToRelative(1.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineTo(9.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-4.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoFile = build;
        build.getClass();
        return build;
    }
}
