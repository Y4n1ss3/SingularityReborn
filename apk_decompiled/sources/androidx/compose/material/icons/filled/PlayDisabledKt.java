package androidx.compose.material.icons.filled;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayDisabledKt {
    private static ImageVector _playDisabled;

    public static final ImageVector getPlayDisabled(Icons.Filled filled) {
        ImageVector imageVector = _playDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PlayDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.0f, 5.19f, 8.0f, 5.0f);
        i.lineToRelative(11.0f, 7.0f);
        gy.B(i, -2.55f, 1.63f, 8.0f, 5.19f);
        i.moveTo(20.0f, 19.73f);
        i.lineToRelative(-5.11f, -5.11f);
        i.lineTo(8.0f, 7.73f);
        i.lineTo(4.27f, 4.0f);
        i.lineTo(3.0f, 5.27f);
        i.lineToRelative(5.0f, 5.0f);
        i.lineTo(8.0f, 19.0f);
        i.lineToRelative(5.33f, -3.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 5.4f, 5.4f, 20.0f, 19.73f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playDisabled = build;
        build.getClass();
        return build;
    }
}
