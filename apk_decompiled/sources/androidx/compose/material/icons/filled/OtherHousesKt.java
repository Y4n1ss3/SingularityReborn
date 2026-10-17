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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OtherHousesKt {
    private static ImageVector _otherHouses;

    public static final ImageVector getOtherHouses(Icons.Filled filled) {
        ImageVector imageVector = _otherHouses;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.OtherHouses", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 3.0f, 1.0f, 11.4f);
        i.lineToRelative(1.21f, 1.59f);
        fc.t(i, 4.0f, 11.62f, 21.0f, 16.0f);
        i.verticalLineToRelative(-9.38f);
        i.lineToRelative(1.79f, 1.36f);
        r6.C(i, 23.0f, 11.4f, 12.0f, 3.0f);
        i.moveTo(8.0f, 15.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.curveTo(9.0f, 14.55f, 8.55f, 15.0f, 8.0f, 15.0f);
        i.close();
        i.moveTo(12.0f, 15.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.curveTo(13.0f, 14.55f, 12.55f, 15.0f, 12.0f, 15.0f);
        i.close();
        i.moveTo(16.0f, 15.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.curveTo(17.0f, 14.55f, 16.55f, 15.0f, 16.0f, 15.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _otherHouses = build;
        build.getClass();
        return build;
    }
}
