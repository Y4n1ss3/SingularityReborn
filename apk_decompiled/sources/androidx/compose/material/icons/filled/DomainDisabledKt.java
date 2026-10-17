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
import defpackage.af0;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DomainDisabledKt {
    private static ImageVector _domainDisabled;

    public static final ImageVector getDomainDisabled(Icons.Filled filled) {
        ImageVector imageVector = _domainDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DomainDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(8.0f, 5.0f, 2.0f, 2.0f, -0.9f);
        n.lineTo(12.0f, 9.9f);
        fc.w(n, 12.0f, 9.0f, 8.0f, 8.9f);
        n.lineToRelative(2.0f, 2.0f);
        n.lineTo(22.0f, 7.0f);
        n.lineTo(12.0f, 7.0f);
        n.lineTo(12.0f, 3.0f);
        r6.C(n, 5.1f, 3.0f, 8.0f, 5.9f);
        k4.C(n, 16.0f, 11.0f, 2.0f, 2.0f);
        j50.t(n, -2.0f, 1.3f, 1.8f);
        n.lineTo(0.1f, 3.1f);
        af0.m(n, 2.0f, 5.0f, 16.0f, 16.0f);
        n.lineToRelative(3.0f, 3.0f);
        fc.C(n, 1.3f, -1.3f, -21.0f, -20.9f);
        n.moveTo(6.0f, 19.0f);
        af0.m(n, 4.0f, 19.0f, -2.0f, 2.0f);
        r6.l(n, 2.0f, 6.0f, 15.0f);
        af0.m(n, 4.0f, 15.0f, -2.0f, 2.0f);
        r6.l(n, 2.0f, 6.0f, 11.0f);
        n.lineTo(4.0f, 11.0f);
        r6.m(n, 4.0f, 9.0f, 2.0f, 2.0f);
        n.moveTo(10.0f, 19.0f);
        af0.m(n, 8.0f, 19.0f, -2.0f, 2.0f);
        r6.l(n, 2.0f, 10.0f, 15.0f);
        af0.m(n, 8.0f, 15.0f, -2.0f, 2.0f);
        kp0.z(n, 2.0f, 12.0f, 19.0f, -2.0f);
        n.horizontalLineToRelative(2.0f);
        n.lineToRelative(2.0f, 2.0f);
        n.horizontalLineToRelative(-4.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _domainDisabled = build;
        build.getClass();
        return build;
    }
}
