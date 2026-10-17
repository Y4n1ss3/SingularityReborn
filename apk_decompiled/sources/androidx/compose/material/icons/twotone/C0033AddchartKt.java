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
import defpackage.af0;
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.material.icons.twotone.AddchartKt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033AddchartKt {
    private static ImageVector _addchart;

    public static final ImageVector getAddchart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addchart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Addchart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(22.0f, 5.0f, 2.0f, -3.0f, 3.0f);
        af0.n(s, -2.0f, 7.0f, -3.0f, 5.0f);
        af0.q(s, 3.0f, 2.0f, 2.0f, 3.0f);
        kp0.B(s, 22.0f, 19.0f, 19.0f, 5.0f);
        k4.u(s, 5.0f, 6.0f, 3.0f, 5.0f);
        s.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        k4.p(s, -6.0f, -2.0f, 19.0f);
        bv.y(s, 15.0f, 13.0f, 4.0f, 2.0f);
        kf0.n(s, -4.0f, 15.0f, 11.0f, 17.0f);
        j50.D(s, 2.0f, 9.0f, -2.0f, 17.0f);
        uf.D(s, 9.0f, 17.0f, -6.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(s, 6.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addchart = build;
        build.getClass();
        return build;
    }
}
