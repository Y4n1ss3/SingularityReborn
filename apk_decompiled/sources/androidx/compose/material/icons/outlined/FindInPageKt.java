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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FindInPageKt {
    private static ImageVector _findInPage;

    public static final ImageVector getFindInPage(Icons.Outlined outlined) {
        ImageVector imageVector = _findInPage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FindInPage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.0f, 2.0f, 6.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(4.0f, 20.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        i.lineTo(18.0f, 22.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.o(i, 20.0f, 8.0f, -6.0f, -6.0f);
        i.moveTo(6.0f, 4.0f);
        fc.D(i, 7.0f, 5.0f, 5.0f, 8.58f);
        i.lineToRelative(-1.84f, -1.84f);
        i.curveToRelative(1.28f, -1.94f, 1.07f, -4.57f, -0.64f, -6.28f);
        i.curveTo(14.55f, 8.49f, 13.28f, 8.0f, 12.0f, 8.0f);
        i.curveToRelative(-1.28f, 0.0f, -2.55f, 0.49f, -3.53f, 1.46f);
        i.curveToRelative(-1.95f, 1.95f, -1.95f, 5.11f, 0.0f, 7.05f);
        i.curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f);
        i.curveToRelative(0.96f, 0.0f, 1.92f, -0.28f, 2.75f, -0.83f);
        i.lineTo(17.6f, 20.0f);
        r6.C(i, 6.0f, 20.0f, 6.0f, 4.0f);
        i.moveTo(14.11f, 15.1f);
        i.curveToRelative(-0.56f, 0.56f, -1.31f, 0.88f, -2.11f, 0.88f);
        i.reflectiveCurveToRelative(-1.55f, -0.31f, -2.11f, -0.88f);
        i.curveToRelative(-0.56f, -0.56f, -0.88f, -1.31f, -0.88f, -2.11f);
        i.reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.11f);
        i.curveToRelative(0.56f, -0.57f, 1.31f, -0.88f, 2.11f, -0.88f);
        i.reflectiveCurveToRelative(1.55f, 0.31f, 2.11f, 0.88f);
        i.curveToRelative(0.56f, 0.56f, 0.88f, 1.31f, 0.88f, 2.11f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.31f, 1.55f, -0.88f, 2.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findInPage = build;
        build.getClass();
        return build;
    }
}
