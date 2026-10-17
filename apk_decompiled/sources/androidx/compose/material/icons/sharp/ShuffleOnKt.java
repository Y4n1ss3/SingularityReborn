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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShuffleOnKt {
    private static ImageVector _shuffleOn;

    public static final ImageVector getShuffleOn(Icons.Sharp sharp) {
        ImageVector imageVector = _shuffleOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ShuffleOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(1.0f, 1.0f, 22.0f, 22.0f, 1.0f);
        k4.w(w, 1.0f, 5.41f, 4.0f);
        w.lineToRelative(5.18f, 5.17f);
        w.lineToRelative(-1.42f, 1.41f);
        r6.C(w, 4.0f, 5.41f, 5.41f, 4.0f);
        w.moveTo(20.0f, 20.0f);
        w.horizontalLineToRelative(-5.5f);
        w.lineToRelative(2.05f, -2.05f);
        w.lineToRelative(-3.13f, -3.13f);
        w.lineToRelative(1.41f, -1.41f);
        w.lineToRelative(3.13f, 3.13f);
        uf.o(w, 20.0f, 14.5f, 20.0f);
        w.moveTo(20.0f, 9.5f);
        w.lineToRelative(-2.04f, -2.04f);
        w.lineTo(5.41f, 20.0f);
        w.lineTo(4.0f, 18.59f);
        w.lineTo(16.54f, 6.04f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(w, 14.5f, 4.0f, 20.0f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shuffleOn = build;
        build.getClass();
        return build;
    }
}
