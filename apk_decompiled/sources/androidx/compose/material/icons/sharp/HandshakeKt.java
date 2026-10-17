package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Sharp sharp) {
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Handshake", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.59f, 5.95f, -7.05f, 7.04f);
        e.lineTo(0.7f, 10.3f);
        e.lineToRelative(8.55f, -8.55f);
        e.lineToRelative(7.95f, 7.95f);
        gy.B(e, -1.42f, 1.42f, 10.59f, 5.95f);
        e.moveTo(23.24f, 10.24f);
        e.lineToRelative(-8.49f, -8.49f);
        e.lineToRelative(-2.06f, 2.06f);
        e.lineToRelative(5.9f, 5.88f);
        e.lineToRelative(-2.83f, 2.83f);
        e.lineToRelative(-5.17f, -5.17f);
        e.lineToRelative(-6.27f, 6.27f);
        e.lineToRelative(1.42f, 1.41f);
        e.lineToRelative(5.32f, -5.32f);
        e.lineToRelative(0.71f, 0.71f);
        e.lineToRelative(-5.32f, 5.32f);
        e.lineToRelative(1.42f, 1.41f);
        e.lineToRelative(5.32f, -5.32f);
        e.lineToRelative(0.71f, 0.71f);
        e.lineToRelative(-5.32f, 5.32f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(5.32f, -5.32f);
        e.lineToRelative(0.71f, 0.71f);
        e.lineTo(10.68f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.41f, 1.41f, 23.24f, 10.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = build;
        build.getClass();
        return build;
    }
}
