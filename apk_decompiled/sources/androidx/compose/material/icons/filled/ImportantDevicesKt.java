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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImportantDevicesKt {
    private static ImageVector _importantDevices;

    public static final ImageVector getImportantDevices(Icons.Filled filled) {
        ImageVector imageVector = _importantDevices;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ImportantDevices", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(23.0f, 11.01f, 18.0f, 11.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(9.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(5.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-9.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -0.99f, -1.0f, -0.99f);
        r6.B(i, 23.0f, 20.0f, -5.0f, -7.0f);
        fc.x(i, 5.0f, 7.0f, 20.0f, 2.0f);
        i.lineTo(2.0f, 2.0f);
        i.curveTo(0.89f, 2.0f, 0.0f, 2.89f, 0.0f, 4.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        bv.C(i, 7.0f, 2.0f, 7.0f, 20.0f);
        r6.D(i, 2.0f, 8.0f, -2.0f, -2.0f);
        kf0.z(i, -2.0f, 2.0f, -2.0f);
        i.lineTo(2.0f, 16.0f);
        fc.w(i, 2.0f, 4.0f, 18.0f, 5.0f);
        i.horizontalLineToRelative(2.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 11.97f, 9.0f, 11.0f, 6.0f);
        i.lineToRelative(-0.97f, 3.0f);
        i.lineTo(7.0f, 9.0f);
        i.lineToRelative(2.47f, 1.76f);
        i.lineToRelative(-0.94f, 2.91f);
        i.lineToRelative(2.47f, -1.8f);
        i.lineToRelative(2.47f, 1.8f);
        i.lineToRelative(-0.94f, -2.91f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(i, 15.0f, 9.0f, -3.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importantDevices = build;
        build.getClass();
        return build;
    }
}
