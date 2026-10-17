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
import defpackage.af0;
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoStableKt {
    private static ImageVector _videoStable;

    public static final ImageVector getVideoStable(Icons.Sharp sharp) {
        ImageVector imageVector = _videoStable;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VideoStable", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 4.0f, 16.0f, 20.0f, 4.0f);
        af0.x(w, 2.0f, 4.0f, 18.0f, 6.0f);
        w.horizontalLineToRelative(2.95f);
        w.lineToRelative(-2.33f, 8.73f);
        kf0.h(w, 16.82f, 18.0f, 4.0f);
        w.moveTo(20.0f, 18.0f);
        w.horizontalLineToRelative(-2.95f);
        w.lineToRelative(2.34f, -8.73f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(w, 7.18f, 6.0f, 20.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoStable = build;
        build.getClass();
        return build;
    }
}
