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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.Outlined outlined) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.17f, 4.91f, 17.1f, 3.84f);
        r6.A(i, -5.55f, 5.55f, 1.08f, 1.08f);
        fc.B(i, 5.54f, -5.56f, 16.0f, 2.74f);
        i.lineToRelative(1.29f, -1.29f);
        i.arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.12f, 0.0f);
        i.lineToRelative(1.15f, 1.15f);
        i.curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f);
        i.lineToRelative(-0.68f, 0.68f);
        i.lineToRelative(-0.02f, 0.02f);
        i.lineToRelative(-0.58f, 0.58f);
        i.lineToRelative(-6.0f, 6.0f);
        i.lineTo(10.0f, 12.0f);
        bv.o(i, 10.0f, 8.74f, 6.0f, -6.0f);
        i.moveTo(13.72f, 2.19f);
        i.lineToRelative(-0.55f, 0.55f);
        i.lineToRelative(-1.27f, 1.27f);
        i.curveToRelative(-3.3f, 0.05f, -5.9f, 2.6f, -5.9f, 6.2f);
        i.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        i.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        i.verticalLineToRelative(-0.1f);
        i.lineToRelative(1.8f, -1.8f);
        i.curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f);
        i.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        i.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        i.curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f);
        i.curveToRelative(0.58f, 0.0f, 1.16f, 0.06f, 1.72f, 0.18f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = build;
        build.getClass();
        return build;
    }
}
