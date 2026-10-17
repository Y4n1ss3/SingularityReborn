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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermDeviceInformationKt {
    private static ImageVector _permDeviceInformation;

    public static final ImageVector getPermDeviceInformation(Icons.Outlined outlined) {
        ImageVector imageVector = _permDeviceInformation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PermDeviceInformation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(11.0f, 7.0f, 2.0f, 2.0f, -2.0f);
        k4.C(q, 11.0f, 11.0f, 2.0f, 6.0f);
        j50.t(q, -2.0f, 17.0f, 1.01f);
        q.lineTo(7.0f, 1.0f);
        q.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q.verticalLineToRelative(18.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q.horizontalLineToRelative(10.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.lineTo(19.0f, 3.0f);
        q.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        k4.r(q, 17.0f, 21.0f, 7.0f, 21.0f);
        r6.p(q, -1.0f, 10.0f, 1.0f);
        q.moveTo(17.0f, 18.0f);
        q.lineTo(7.0f, 18.0f);
        r6.m(q, 7.0f, 6.0f, 10.0f, 12.0f);
        q.moveTo(7.0f, 4.0f);
        fc.w(q, 7.0f, 3.0f, 10.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(q, 7.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permDeviceInformation = build;
        build.getClass();
        return build;
    }
}
