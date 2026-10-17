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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AcUnitKt {
    private static ImageVector _acUnit;

    public static final ImageVector getAcUnit(Icons.Filled filled) {
        ImageVector imageVector = _acUnit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AcUnit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(22.0f, 11.0f, -4.17f, 3.24f, -3.24f);
        i.lineToRelative(-1.41f, -1.42f);
        kf0.y(i, 15.0f, 11.0f, -2.0f, 9.0f);
        i.lineToRelative(4.66f, -4.66f);
        i.lineToRelative(-1.42f, -1.41f);
        fc.t(i, 13.0f, 6.17f, 2.0f, -2.0f);
        i.verticalLineToRelative(4.17f);
        i.lineTo(7.76f, 2.93f);
        i.lineTo(6.34f, 4.34f);
        kf0.u(i, 11.0f, 9.0f, 2.0f, 9.0f);
        i.lineTo(4.34f, 6.34f);
        i.lineTo(2.93f, 7.76f);
        r6.w(i, 6.17f, 11.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(4.17f);
        i.lineToRelative(-3.24f, 3.24f);
        i.lineToRelative(1.41f, 1.42f);
        fc.w(i, 9.0f, 13.0f, 2.0f, 2.0f);
        i.lineToRelative(-4.66f, 4.66f);
        i.lineToRelative(1.42f, 1.41f);
        fc.t(i, 11.0f, 17.83f, 22.0f, 2.0f);
        i.verticalLineToRelative(-4.17f);
        i.lineToRelative(3.24f, 3.24f);
        i.lineToRelative(1.42f, -1.41f);
        af0.m(i, 13.0f, 15.0f, -2.0f, 2.0f);
        i.lineToRelative(4.66f, 4.66f);
        i.lineToRelative(1.41f, -1.42f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(i, 17.83f, 13.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _acUnit = build;
        build.getClass();
        return build;
    }
}
