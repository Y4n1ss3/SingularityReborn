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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TranscribeKt {
    private static ImageVector _transcribe;

    public static final ImageVector getTranscribe(Icons.Rounded rounded) {
        ImageVector imageVector = _transcribe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Transcribe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.54f, 10.28f);
        b.curveToRelative(-0.34f, -0.82f, -0.34f, -1.72f, 0.0f, -2.54f);
        b.curveToRelative(0.19f, -0.45f, 0.1f, -0.96f, -0.24f, -1.3f);
        b.lineToRelative(-0.1f, -0.1f);
        b.curveToRelative(-0.56f, -0.56f, -1.51f, -0.44f, -1.88f, 0.26f);
        b.curveToRelative(-0.8f, 1.48f, -0.79f, 3.24f, 0.03f, 4.79f);
        b.curveToRelative(0.37f, 0.69f, 1.31f, 0.83f, 1.86f, 0.27f);
        b.lineToRelative(0.1f, -0.1f);
        b.curveTo(22.65f, 11.23f, 22.73f, 10.72f, 22.54f, 10.28f);
        k4.r(b, 18.82f, 15.11f, 18.82f, 15.11f);
        b.curveToRelative(0.4f, -0.4f, 0.46f, -1.02f, 0.13f, -1.48f);
        b.curveToRelative(-1.97f, -2.73f, -1.96f, -6.39f, 0.01f, -9.23f);
        b.curveToRelative(0.32f, -0.47f, 0.26f, -1.1f, -0.14f, -1.5f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.5f, -0.5f, -1.34f, -0.46f, -1.78f, 0.1f);
        b.curveToRelative(-2.73f, 3.54f, -2.73f, 8.36f, 0.02f, 12.0f);
        b.curveTo(17.49f, 15.56f, 18.33f, 15.61f, 18.82f, 15.11f);
        b.close();
        b.moveTo(9.0f, 13.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f);
        b.curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f);
        b.close();
        b.moveTo(15.39f, 15.56f);
        b.curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f);
        b.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        b.curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f);
        b.lineTo(1.0f, 20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.lineToRelative(0.0f, -1.78f);
        b.curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transcribe = build;
        build.getClass();
        return build;
    }
}
