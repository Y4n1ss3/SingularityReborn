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
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.Sharp sharp) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.11f, 1.77f, 19.78f, 0.1f);
        i.lineToRelative(2.12f, 2.12f);
        fc.C(i, -1.67f, 1.67f, -2.12f, -2.12f);
        i.moveTo(17.11f, 2.77f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineTo(13.12f, 11.0f);
        i.lineTo(11.0f, 11.0f);
        bv.o(i, 11.0f, 8.89f, 6.11f, -6.12f);
        i.moveTo(15.13f, 2.64f);
        af0.m(i, 9.5f, 8.27f, 4.24f, 4.24f);
        i.lineToRelative(5.62f, -5.62f);
        i.curveToRelative(0.41f, 0.99f, 0.64f, 2.1f, 0.64f, 3.32f);
        i.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        i.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        i.curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f);
        i.curveToRelative(1.09f, 0.0f, 2.16f, 0.22f, 3.13f, 0.63f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = build;
        build.getClass();
        return build;
    }
}
