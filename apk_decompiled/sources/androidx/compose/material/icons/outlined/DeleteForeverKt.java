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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeleteForeverKt {
    private static ImageVector _deleteForever;

    public static final ImageVector getDeleteForever(Icons.Outlined outlined) {
        ImageVector imageVector = _deleteForever;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DeleteForever", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.12f, 10.47f, 12.0f, 12.59f);
        i.lineToRelative(-2.13f, -2.12f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineTo(10.59f, 14.0f);
        i.lineToRelative(-2.12f, 2.12f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineTo(12.0f, 15.41f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(1.41f, -1.41f);
        bv.o(i, 13.41f, 14.0f, 2.12f, -2.12f);
        i.moveTo(15.5f, 4.0f);
        i.lineToRelative(-1.0f, -1.0f);
        r6.t(i, -5.0f, -1.0f, 1.0f, 5.0f);
        k4.p(i, 2.0f, 14.0f, 4.0f);
        i.moveTo(6.0f, 19.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(8.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(7.0f);
        i.horizontalLineTo(6.0f);
        i.verticalLineToRelative(12.0f);
        i.close();
        k4.C(i, 8.0f, 9.0f, 8.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(i, 8.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deleteForever = build;
        build.getClass();
        return build;
    }
}
