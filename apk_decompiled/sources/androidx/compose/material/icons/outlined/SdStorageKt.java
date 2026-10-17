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
import defpackage.af0;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SdStorageKt {
    private static ImageVector _sdStorage;

    public static final ImageVector getSdStorage(Icons.Outlined outlined) {
        ImageVector imageVector = _sdStorage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SdStorage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(18.0f, 4.0f, 16.0f, 6.0f, 20.0f);
        y.lineTo(6.0f, 8.83f);
        y.lineTo(10.83f, 4.0f);
        y.lineTo(18.0f, 4.0f);
        y.moveToRelative(0.0f, -2.0f);
        y.horizontalLineToRelative(-8.0f);
        y.lineTo(4.0f, 8.0f);
        y.verticalLineToRelative(12.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(12.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.lineTo(20.0f, 4.0f);
        y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(y, 9.0f, 7.0f, 2.0f, 4.0f);
        uo.l(y, 9.0f, 11.0f, 12.0f, 7.0f);
        j50.n(y, 2.0f, 4.0f, -2.0f);
        k4.C(y, 15.0f, 7.0f, 2.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(y, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sdStorage = build;
        build.getClass();
        return build;
    }
}
