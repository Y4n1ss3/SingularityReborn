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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactsKt {
    private static ImageVector _contacts;

    public static final ImageVector getContacts(Icons.Sharp sharp) {
        ImageVector imageVector = _contacts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Contacts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(20.0f, 0.0f, 4.0f, 2.0f, 16.0f);
        k4.D(i, 0.0f, 4.0f, 24.0f, 16.0f);
        i.verticalLineToRelative(-2.0f);
        i.horizontalLineTo(4.0f);
        i.verticalLineToRelative(2.0f);
        i.close();
        k4.A(i, 22.0f, 4.0f, 2.0f, 16.0f);
        uo.r(i, 20.0f, 4.0f, 12.0f, 6.75f);
        i.curveToRelative(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        i.reflectiveCurveToRelative(-1.01f, 2.25f, -2.25f, 2.25f);
        i.reflectiveCurveTo(9.75f, 10.24f, 9.75f, 9.0f);
        i.reflectiveCurveTo(10.76f, 6.75f, 12.0f, 6.75f);
        uo.q(i, 17.0f, 17.0f, 7.0f, -1.5f);
        i.curveToRelative(0.0f, -1.67f, 3.33f, -2.5f, 5.0f, -2.5f);
        i.reflectiveCurveToRelative(5.0f, 0.83f, 5.0f, 2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contacts = build;
        build.getClass();
        return build;
    }
}
