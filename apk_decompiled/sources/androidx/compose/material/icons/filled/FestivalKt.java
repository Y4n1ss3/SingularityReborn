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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FestivalKt {
    private static ImageVector _festival;

    public static final ImageVector getFestival(Icons.Filled filled) {
        ImageVector imageVector = _festival;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Festival", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 5.7f, 0.0f, -1.7f);
        e.lineToRelative(3.0f, 0.0f);
        e.lineToRelative(-1.0f, -1.49f);
        e.lineToRelative(1.0f, -1.51f);
        e.lineToRelative(-5.0f, 0.0f);
        e.lineToRelative(0.0f, 4.7f);
        e.lineToRelative(-9.0f, 6.3f);
        e.lineToRelative(0.0f, 10.0f);
        e.lineToRelative(7.0f, 0.0f);
        e.lineToRelative(0.0f, -5.0f);
        e.lineToRelative(3.03f, -2.0f);
        e.lineToRelative(2.97f, 2.0f);
        e.lineToRelative(0.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 7.0f, 0.0f, 0.0f, -10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _festival = build;
        build.getClass();
        return build;
    }
}
