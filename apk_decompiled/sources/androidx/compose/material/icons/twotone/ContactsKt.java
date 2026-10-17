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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactsKt {
    private static ImageVector _contacts;

    public static final ImageVector getContacts(Icons.TwoTone twoTone) {
        ImageVector imageVector = _contacts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Contacts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(20.0f, 6.0f, 4.0f, 6.0f, 12.0f);
        gy.n(s, 16.0f, 20.0f, 6.0f);
        s.moveTo(12.0f, 7.0f);
        s.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        s.reflectiveCurveTo(13.38f, 12.0f, 12.0f, 12.0f);
        s.reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f);
        s.reflectiveCurveTo(10.62f, 7.0f, 12.0f, 7.0f);
        k4.r(s, 17.0f, 17.0f, 7.0f, 17.0f);
        s.verticalLineToRelative(-1.01f);
        s.curveTo(7.0f, 13.9f, 10.31f, 13.0f, 12.0f, 13.0f);
        s.reflectiveCurveToRelative(5.0f, 0.9f, 5.0f, 2.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(s, 17.0f, 17.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.0f, 20.0f, 16.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(22.0f, 6.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.lineTo(4.0f, 4.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r6.B(a, 4.0f, 6.0f, 16.0f, 12.0f);
        r6.C(a, 4.0f, 18.0f, 4.0f, 6.0f);
        k4.C(a, 4.0f, 0.0f, 16.0f, 2.0f);
        uo.l(a, 4.0f, 2.0f, 4.0f, 22.0f);
        j50.o(a, 16.0f, 2.0f, 4.0f, 24.0f);
        a.moveTo(12.0f, 12.0f);
        a.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        a.reflectiveCurveTo(13.38f, 7.0f, 12.0f, 7.0f);
        a.reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f);
        a.reflectiveCurveTo(10.62f, 12.0f, 12.0f, 12.0f);
        a.close();
        a.moveTo(12.0f, 8.5f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.close();
        a.moveTo(12.0f, 13.0f);
        a.curveToRelative(-1.69f, 0.0f, -5.0f, 0.9f, -5.0f, 2.99f);
        fc.w(a, 7.0f, 17.0f, 10.0f, -1.01f);
        a.curveTo(17.0f, 13.9f, 13.69f, 13.0f, 12.0f, 13.0f);
        a.close();
        a.moveTo(8.81f, 15.5f);
        a.curveToRelative(0.61f, -0.52f, 2.03f, -1.0f, 3.19f, -1.0f);
        a.curveToRelative(1.17f, 0.0f, 2.59f, 0.48f, 3.2f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 8.81f, 15.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contacts = build;
        build.getClass();
        return build;
    }
}
