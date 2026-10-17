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
import defpackage.fc;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoSimKt {
    private static ImageVector _noSim;

    public static final ImageVector getNoSim(Icons.Outlined outlined) {
        ImageVector imageVector = _noSim;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoSim", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.26f, 21.21f, 3.79f, 3.74f);
        i.lineTo(2.38f, 5.15f);
        i.lineToRelative(2.74f, 2.74f);
        i.lineToRelative(-0.12f, 0.12f);
        i.lineTo(5.0f, 19.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(0.35f, 0.0f, 0.68f, -0.1f, 0.97f, -0.26f);
        fc.C(i, 1.88f, 1.88f, 1.41f, -1.41f);
        i.moveTo(7.0f, 19.0f);
        i.lineTo(7.0f, 9.77f);
        r6.C(i, 16.23f, 19.0f, 7.0f, 19.0f);
        i.moveTo(10.84f, 5.0f);
        i.lineTo(17.0f, 5.0f);
        i.verticalLineToRelative(9.11f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineTo(19.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineToRelative(-6.99f);
        i.lineTo(7.95f, 5.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, 1.41f, 10.84f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noSim = build;
        build.getClass();
        return build;
    }
}
