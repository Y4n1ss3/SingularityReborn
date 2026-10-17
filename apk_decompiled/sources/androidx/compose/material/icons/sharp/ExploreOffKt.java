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
public final class ExploreOffKt {
    private static ImageVector _exploreOff;

    public static final ImageVector getExploreOff(Icons.Sharp sharp) {
        ImageVector imageVector = _exploreOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ExploreOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 6.0f, -2.91f, 6.26f);
        e.lineToRelative(5.25f, 5.25f);
        e.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        e.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        e.curveToRelative(-2.04f, 0.0f, -3.93f, 0.61f, -5.51f, 1.66f);
        gy.B(e, 5.25f, 5.25f, 18.0f, 6.0f);
        e.moveTo(2.1f, 4.93f);
        e.lineToRelative(1.56f, 1.56f);
        e.curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f);
        e.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        e.curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f);
        e.lineToRelative(1.56f, 1.56f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 3.51f, 3.51f, 2.1f, 4.93f);
        e.moveTo(8.91f, 11.74f);
        e.lineToRelative(3.35f, 3.35f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 6.0f, 18.0f, 2.91f, -6.26f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exploreOff = build;
        build.getClass();
        return build;
    }
}
