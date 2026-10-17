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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabletAndroidKt {
    private static ImageVector _tabletAndroid;

    public static final ImageVector getTabletAndroid(Icons.Filled filled) {
        ImageVector imageVector = _tabletAndroid;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TabletAndroid", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 0.0f, 6.0f);
        d.curveTo(4.34f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        d.verticalLineToRelative(18.0f);
        d.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        d.verticalLineTo(3.0f);
        d.curveTo(21.0f, 1.34f, 19.66f, 0.0f, 18.0f, 0.0f);
        r6.B(d, 14.0f, 22.0f, -4.0f, -1.0f);
        uo.r(d, 4.0f, 22.0f, 19.25f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(d, 4.75f, 3.0f, 14.5f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tabletAndroid = build;
        build.getClass();
        return build;
    }
}
