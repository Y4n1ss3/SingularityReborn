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
import defpackage.c21;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AudioFileKt {
    private static ImageVector _audioFile;

    public static final ImageVector getAudioFile(Icons.Rounded rounded) {
        ImageVector imageVector = _audioFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AudioFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.41f, 7.41f, -4.83f, -4.83f);
        e.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        e.horizontalLineTo(6.0f);
        e.curveTo(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
        e.lineTo(4.0f, 20.0f);
        e.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        e.horizontalLineTo(18.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(8.83f);
        e.curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
        r6.B(e, 15.0f, 13.0f, -2.0f, 3.61f);
        e.curveToRelative(0.0f, 1.28f, -1.0f, 2.41f, -2.28f, 2.39f);
        e.curveToRelative(-1.44f, -0.02f, -2.56f, -1.39f, -2.13f, -2.91f);
        e.curveToRelative(0.21f, -0.72f, 0.8f, -1.31f, 1.53f, -1.51f);
        e.curveToRelative(0.7f, -0.19f, 1.36f, -0.05f, 1.88f, 0.29f);
        e.verticalLineTo(12.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(16.0f, 12.55f, 15.55f, 13.0f, 15.0f, 13.0f);
        e.close();
        e.moveTo(14.0f, 9.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(e, 3.5f, 18.5f, 9.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _audioFile = build;
        build.getClass();
        return build;
    }
}
