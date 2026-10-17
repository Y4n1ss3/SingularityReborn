package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayArrowKt {
    private static ImageVector _playArrow;

    public static final ImageVector getPlayArrow(Icons.Sharp sharp) {
        ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(new ImageVector.Builder("Sharp.PlayArrow", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null), gy.q(kp0.n(8.0f, 5.0f, 14.0f, 11.0f, -7.0f), 8.0f, 5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), StrokeJoin.Companion.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = build;
        build.getClass();
        return build;
    }
}
