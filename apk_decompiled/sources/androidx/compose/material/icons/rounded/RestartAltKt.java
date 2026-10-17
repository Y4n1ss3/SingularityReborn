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
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestartAltKt {
    private static ImageVector _restartAlt;

    public static final ImageVector getRestartAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _restartAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RestartAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(12.0f, 5.0f, 3.21f);
        d.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        d.lineTo(8.35f, 5.65f);
        d.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        d.lineToRelative(2.79f, 2.79f);
        d.curveTo(11.46f, 9.46f, 12.0f, 9.24f, 12.0f, 8.79f);
        d.verticalLineTo(7.0f);
        d.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        d.curveToRelative(0.0f, 2.72f, -1.83f, 5.02f, -4.31f, 5.75f);
        d.curveTo(13.27f, 18.87f, 13.0f, 19.27f, 13.0f, 19.7f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.65f, 0.62f, 1.16f, 1.25f, 0.97f);
        d.curveTo(17.57f, 19.7f, 20.0f, 16.64f, 20.0f, 13.0f);
        d.curveTo(20.0f, 8.58f, 16.42f, 5.0f, 12.0f, 5.0f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 13.0f);
        b.curveToRelative(0.0f, -1.34f, 0.44f, -2.58f, 1.19f, -3.59f);
        b.curveToRelative(0.3f, -0.4f, 0.26f, -0.95f, -0.09f, -1.31f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(6.68f, 7.68f, 5.96f, 7.72f, 5.6f, 8.2f);
        b.curveTo(4.6f, 9.54f, 4.0f, 11.2f, 4.0f, 13.0f);
        b.curveToRelative(0.0f, 3.64f, 2.43f, 6.7f, 5.75f, 7.67f);
        b.curveTo(10.38f, 20.86f, 11.0f, 20.35f, 11.0f, 19.7f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.43f, -0.27f, -0.83f, -0.69f, -0.95f);
        b.curveTo(7.83f, 18.02f, 6.0f, 15.72f, 6.0f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restartAlt = build;
        build.getClass();
        return build;
    }
}
