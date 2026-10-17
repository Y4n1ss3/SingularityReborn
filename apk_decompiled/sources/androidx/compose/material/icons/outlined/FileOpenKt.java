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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FileOpenKt {
    private static ImageVector _fileOpen;

    public static final ImageVector getFileOpen(Icons.Outlined outlined) {
        ImageVector imageVector = _fileOpen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FileOpen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(15.0f, 22.0f, 6.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        fc.D(d, 8.0f, 6.0f, 6.0f, 6.0f);
        af0.n(d, -2.0f, 9.0f, -5.0f, 4.0f);
        bv.h(d, 6.0f, 16.0f, 9.0f, 22.0f);
        d.moveTo(19.0f, 21.66f);
        d.lineToRelative(0.0f, -2.24f);
        d.lineToRelative(2.95f, 2.95f);
        d.lineToRelative(1.41f, -1.41f);
        fc.w(d, 20.41f, 18.0f, 2.24f, -2.0f);
        d.horizontalLineTo(17.0f);
        d.verticalLineToRelative(5.66f);
        d.horizontalLineTo(19.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fileOpen = build;
        build.getClass();
        return build;
    }
}
