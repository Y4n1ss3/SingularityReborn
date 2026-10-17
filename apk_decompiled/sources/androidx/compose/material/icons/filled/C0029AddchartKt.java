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
import defpackage.bv;
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.material.icons.filled.AddchartKt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029AddchartKt {
    private static ImageVector _addchart;

    public static final ImageVector getAddchart(Icons.Filled filled) {
        ImageVector imageVector = _addchart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Addchart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(22.0f, 5.0f, 2.0f, -3.0f, 3.0f);
        uo.n(s, -2.0f, 17.0f, 7.0f, -3.0f);
        s.lineTo(14.0f, 5.0f);
        uo.n(s, 3.0f, 17.0f, 2.0f, 2.0f);
        kf0.C(s, 3.0f, 3.0f, 19.0f, 19.0f);
        s.lineTo(5.0f, 19.0f);
        s.lineTo(5.0f, 5.0f);
        s.horizontalLineToRelative(6.0f);
        s.lineTo(11.0f, 3.0f);
        s.lineTo(5.0f, 3.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.p(s, -6.0f, -2.0f, 6.0f);
        bv.y(s, 15.0f, 13.0f, 4.0f, 2.0f);
        kf0.C(s, -4.0f, -2.0f, 11.0f, 17.0f);
        uo.n(s, 2.0f, 13.0f, 9.0f, -2.0f);
        kp0.z(s, 8.0f, 9.0f, 17.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(s, 7.0f, 11.0f, 6.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addchart = build;
        build.getClass();
        return build;
    }
}
