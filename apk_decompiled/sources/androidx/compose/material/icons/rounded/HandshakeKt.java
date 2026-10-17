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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Rounded rounded) {
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Handshake", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.48f, 10.41f);
        b.curveToRelative(-0.39f, 0.39f, -1.04f, 0.39f, -1.43f, 0.0f);
        b.lineToRelative(-4.47f, -4.46f);
        b.lineToRelative(-7.05f, 7.04f);
        b.lineToRelative(-0.66f, -0.63f);
        b.curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.0f, -4.24f);
        b.lineToRelative(4.24f, -4.24f);
        b.curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0.0f);
        b.lineTo(16.48f, 9.0f);
        b.curveTo(16.87f, 9.39f, 16.87f, 10.02f, 16.48f, 10.41f);
        b.close();
        b.moveTo(17.18f, 8.29f);
        b.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        b.curveToRelative(-1.27f, 1.27f, -2.61f, 0.22f, -2.83f, 0.0f);
        b.lineToRelative(-3.76f, -3.76f);
        b.lineToRelative(-5.57f, 5.57f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        b.lineToRelative(4.62f, -4.62f);
        b.lineToRelative(0.71f, 0.71f);
        b.lineToRelative(-4.62f, 4.62f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        b.lineToRelative(4.62f, -4.62f);
        b.lineToRelative(0.71f, 0.71f);
        b.lineToRelative(-4.62f, 4.62f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(4.62f, -4.62f);
        b.lineToRelative(0.71f, 0.71f);
        b.lineToRelative(-4.62f, 4.62f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(8.32f, -8.34f);
        b.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        b.lineToRelative(-4.24f, -4.24f);
        b.curveToRelative(-1.15f, -1.15f, -3.01f, -1.17f, -4.18f, -0.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 17.18f, 8.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = build;
        build.getClass();
        return build;
    }
}
