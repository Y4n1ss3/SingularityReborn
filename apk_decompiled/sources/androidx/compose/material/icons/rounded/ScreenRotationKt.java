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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenRotationKt {
    private static ImageVector _screenRotation;

    public static final ImageVector getScreenRotation(Icons.Rounded rounded) {
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ScreenRotation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.23f, 1.75f);
        b.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        b.lineTo(1.75f, 8.11f);
        b.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        b.lineToRelative(12.02f, 12.02f);
        b.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        b.lineToRelative(6.36f, -6.36f);
        b.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        uo.l(b, 10.23f, 1.75f, 14.12f, 20.48f);
        b.lineTo(3.52f, 9.88f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(4.95f, -4.95f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(10.61f, 10.61f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(-4.95f, 4.95f);
        b.curveToRelative(-0.39f, 0.38f, -1.03f, 0.38f, -1.42f, -0.01f);
        b.close();
        b.moveTo(17.61f, 1.4f);
        b.curveTo(16.04f, 0.57f, 14.06f, -0.03f, 11.81f, 0.02f);
        b.curveToRelative(-0.18f, 0.0f, -0.26f, 0.22f, -0.14f, 0.35f);
        b.lineToRelative(3.48f, 3.48f);
        b.lineToRelative(1.33f, -1.33f);
        b.curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f);
        b.curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f);
        b.curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f);
        b.curveToRelative(-0.6f, -3.8f, -2.96f, -7.0f, -6.24f, -8.74f);
        k4.x(b, 8.85f, 20.16f, -1.33f, 1.33f);
        b.curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f);
        b.curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f);
        b.curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f);
        b.curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f);
        b.curveToRelative(1.57f, 0.83f, 3.55f, 1.43f, 5.8f, 1.38f);
        b.curveToRelative(0.18f, 0.0f, 0.26f, -0.22f, 0.14f, -0.35f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -3.48f, -3.49f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = build;
        build.getClass();
        return build;
    }
}
