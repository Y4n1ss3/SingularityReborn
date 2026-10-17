package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StickyNote2Kt {
    private static ImageVector _stickyNote2;

    public static final ImageVector getStickyNote2(Icons.TwoTone twoTone) {
        ImageVector imageVector = _stickyNote2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.StickyNote2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(5.0f, 5.0f, 14.0f, 9.0f, -5.0f);
        kf0.v(s, 5.0f, 5.0f, 5.0f);
        k4.A(s, 12.0f, 14.0f, 7.0f, -2.0f);
        uo.r(s, 5.0f, 14.0f, 17.0f, 10.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(s, 7.0f, 8.0f, 10.0f, 10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(19.0f, 5.0f, 9.0f, -5.0f, 0.0f);
        kp0.v(n, 0.0f, 5.0f, 5.0f, 5.0f);
        r6.z(n, 19.0f, 19.0f, 3.0f, 5.0f);
        n.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        n.verticalLineToRelative(14.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kp0.q(n, 10.0f, 6.0f, -6.0f, 5.0f);
        n.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.q(n, 12.0f, 14.0f, 7.0f, -2.0f);
        uo.r(n, 5.0f, 14.0f, 17.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(n, 7.0f, 8.0f, 10.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stickyNote2 = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getStickyNote2$annotations(Icons.TwoTone twoTone) {
    }
}
