package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StoreKt {
    private static ImageVector _store;

    public static final ImageVector getStore(Icons.Rounded rounded) {
        ImageVector imageVector = _store;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Store", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(5.0f, 6.0f, 14.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        a.lineTo(5.0f, 4.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.close();
        a.moveTo(20.16f, 7.8f);
        a.curveToRelative(-0.09f, -0.46f, -0.5f, -0.8f, -0.98f, -0.8f);
        a.lineTo(4.82f, 7.0f);
        a.curveToRelative(-0.48f, 0.0f, -0.89f, 0.34f, -0.98f, 0.8f);
        a.lineToRelative(-1.0f, 5.0f);
        a.curveToRelative(-0.12f, 0.62f, 0.35f, 1.2f, 0.98f, 1.2f);
        a.lineTo(4.0f, 14.0f);
        a.verticalLineToRelative(5.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(8.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(a, -5.0f, 4.0f, 5.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-5.0f);
        a.horizontalLineToRelative(0.18f);
        a.curveToRelative(0.63f, 0.0f, 1.1f, -0.58f, 0.98f, -1.2f);
        fc.B(a, -1.0f, -5.0f, 12.0f, 18.0f);
        af0.m(a, 6.0f, 18.0f, -4.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(a, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _store = build;
        build.getClass();
        return build;
    }
}
