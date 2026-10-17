package androidx.compose.material.icons.outlined;

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
public final class AlignVerticalCenterKt {
    private static ImageVector _alignVerticalCenter;

    public static final ImageVector getAlignVerticalCenter(Icons.Outlined outlined) {
        ImageVector imageVector = _alignVerticalCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AlignVerticalCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 11.0f, -5.0f, 0.0f);
        e.lineToRelative(0.0f, -5.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, 5.0f);
        e.lineToRelative(-4.0f, 0.0f);
        e.lineToRelative(0.0f, -8.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, 8.0f);
        e.lineToRelative(-5.16f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(5.16f, 0.0f);
        e.lineToRelative(0.0f, 8.0f);
        e.lineToRelative(3.0f, 0.0f);
        e.lineToRelative(0.0f, -8.0f);
        e.lineToRelative(4.0f, 0.0f);
        e.lineToRelative(0.0f, 5.0f);
        e.lineToRelative(3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -5.0f, 5.0f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignVerticalCenter = build;
        build.getClass();
        return build;
    }
}
