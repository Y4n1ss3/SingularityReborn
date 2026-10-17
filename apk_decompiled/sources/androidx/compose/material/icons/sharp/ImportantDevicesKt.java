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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImportantDevicesKt {
    private static ImageVector _importantDevices;

    public static final ImageVector getImportantDevices(Icons.Sharp sharp) {
        ImageVector imageVector = _importantDevices;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ImportantDevices", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(24.0f, 11.01f, 17.0f, 11.0f, 11.0f);
        uo.r(s, 7.0f, 11.01f, 23.0f, 20.0f);
        gy.D(s, -5.0f, -7.0f, 5.0f, 7.0f);
        k4.A(s, 22.0f, 2.0f, 0.0f, 16.0f);
        af0.z(s, 9.0f, 2.0f, 7.0f, 2.0f);
        af0.v(s, 8.0f, -2.0f, -2.0f, -2.0f);
        gy.o(s, 2.0f, -2.0f, 2.0f, 4.0f);
        bv.l(s, 18.0f, 5.0f, 2.0f, 2.0f);
        s.moveTo(11.97f, 9.0f);
        s.lineTo(11.0f, 6.0f);
        s.lineToRelative(-0.97f, 3.0f);
        s.horizontalLineTo(7.0f);
        s.lineToRelative(2.47f, 1.76f);
        s.lineToRelative(-0.94f, 2.91f);
        s.lineToRelative(2.47f, -1.8f);
        s.lineToRelative(2.47f, 1.8f);
        s.lineToRelative(-0.94f, -2.91f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(s, 15.0f, 9.0f, -3.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importantDevices = build;
        build.getClass();
        return build;
    }
}
