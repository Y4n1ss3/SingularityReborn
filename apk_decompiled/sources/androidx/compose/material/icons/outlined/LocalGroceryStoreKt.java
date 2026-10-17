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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalGroceryStoreKt {
    private static ImageVector _localGroceryStore;

    public static final ImageVector getLocalGroceryStore(Icons.Outlined outlined) {
        ImageVector imageVector = _localGroceryStore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalGroceryStore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.close();
        b.moveTo(17.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.close();
        b.moveTo(15.55f, 13.0f);
        b.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        b.lineToRelative(3.58f, -6.49f);
        b.curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f);
        b.lineTo(5.21f, 4.0f);
        b.lineToRelative(-0.94f, -2.0f);
        af0.m(b, 1.0f, 2.0f, 2.0f, 2.0f);
        b.lineToRelative(3.6f, 7.59f);
        b.lineToRelative(-1.35f, 2.44f);
        b.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        bv.C(b, 12.0f, -2.0f, 7.0f, 15.0f);
        uf.r(b, 1.1f, -2.0f, 7.45f);
        b.moveTo(6.16f, 6.0f);
        b.horizontalLineToRelative(12.15f);
        b.lineToRelative(-2.76f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 8.53f, 11.0f, 6.16f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localGroceryStore = build;
        build.getClass();
        return build;
    }
}
