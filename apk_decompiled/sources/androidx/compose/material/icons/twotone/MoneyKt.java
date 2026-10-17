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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoneyKt {
    private static ImageVector _money;

    public static final ImageVector getMoney(Icons.TwoTone twoTone) {
        ImageVector imageVector = _money;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Money", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(10.0f, 10.0f, 1.0f, 4.0f, -1.0f);
        k4.C(q, 16.0f, 10.0f, 1.0f, 4.0f);
        kp0.A(q, -1.0f, 4.0f, 18.0f, 16.0f);
        q.lineTo(20.0f, 6.0f);
        bv.r(q, 4.0f, 6.0f, 12.0f);
        q.moveTo(14.0f, 9.0f);
        q.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        q.horizontalLineToRelative(3.0f);
        q.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        q.verticalLineToRelative(6.0f);
        q.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        q.horizontalLineToRelative(-3.0f);
        q.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        uo.l(q, 14.0f, 9.0f, 8.0f, 9.0f);
        q.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        q.horizontalLineToRelative(3.0f);
        q.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        q.verticalLineToRelative(6.0f);
        q.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        q.lineTo(9.0f, 16.0f);
        q.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        uo.l(q, 8.0f, 9.0f, 5.0f, 8.0f);
        bv.C(q, 2.0f, 8.0f, 5.0f, 16.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(q, 5.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(15.0f, 16.0f, 3.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.lineTo(19.0f, 9.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineToRelative(-3.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(6.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        r6.B(a, 16.0f, 10.0f, 1.0f, 4.0f);
        fc.x(a, -1.0f, -4.0f, 9.0f, 16.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.lineTo(13.0f, 9.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.lineTo(9.0f, 8.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(6.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        r6.B(a, 10.0f, 10.0f, 1.0f, 4.0f);
        fc.x(a, -1.0f, -4.0f, 5.0f, 8.0f);
        j50.o(a, 2.0f, 8.0f, 5.0f, 16.0f);
        bv.y(a, 2.0f, 4.0f, 16.0f, 20.0f);
        r6.C(a, 22.0f, 4.0f, 2.0f, 4.0f);
        a.moveTo(20.0f, 18.0f);
        a.lineTo(4.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(a, 4.0f, 6.0f, 16.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _money = build;
        build.getClass();
        return build;
    }
}
