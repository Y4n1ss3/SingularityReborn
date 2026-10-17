package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xc0 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public CharSequence e;
    public CharSequence f;
    public int g;
    public String h;
    public String i;
    public Bundle j;
    public final String k;
    public final Notification l;
    public final ArrayList m;

    public xc0(Context context, String str) {
        Notification notification = new Notification();
        this.l = notification;
        this.a = context;
        this.k = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.g = 0;
        this.m = new ArrayList();
    }

    public static CharSequence b(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017d  */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Notification, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification a() {
        int i;
        boolean z;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i2;
        new ArrayList();
        Bundle bundle = new Bundle();
        Context context = this.a;
        String str2 = this.k;
        Notification.Builder builder = new Notification.Builder(context, str2);
        Notification notification = this.l;
        Icon icon = null;
        boolean z2 = false;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & Fields.SpotShadowColor) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.g);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            wc0 wc0Var = (wc0) obj;
            IconCompat iconCompat = wc0Var.b;
            if (iconCompat == null && (i2 = wc0Var.d) != 0) {
                iconCompat = IconCompat.a(i2);
                wc0Var.b = iconCompat;
            }
            Bundle bundle2 = wc0Var.a;
            Notification notification2 = icon;
            if (iconCompat != null) {
                int i4 = iconCompat.a;
                switch (i4) {
                    case -1:
                        z = z2;
                        icon = (Icon) iconCompat.b;
                        break;
                    case 0:
                    default:
                        o.m("Unknown type");
                        return notification2;
                    case 1:
                        z = z2;
                        icon = Icon.createWithBitmap((Bitmap) iconCompat.b);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            icon.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            icon.setTintMode(mode);
                            break;
                        }
                        break;
                    case 2:
                        z = z2;
                        if (i4 == -1) {
                            str = ((Icon) iconCompat.b).getResPackage();
                        } else {
                            if (i4 != 2) {
                                o.l(iconCompat, "called getResPackage() on ");
                                return notification2;
                            }
                            String str3 = iconCompat.j;
                            str = (str3 == null || TextUtils.isEmpty(str3)) ? ((String) iconCompat.b).split(":", -1)[z ? 1 : 0] : iconCompat.j;
                        }
                        icon = Icon.createWithResource(str, iconCompat.e);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case 3:
                        z = z2;
                        icon = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case 4:
                        z = z2;
                        icon = Icon.createWithContentUri((String) iconCompat.b);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case 5:
                        z = z2;
                        icon = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.b);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case 6:
                        z = z2;
                        if (Build.VERSION.SDK_INT < 30) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                        }
                        icon = v0.a(iconCompat.c());
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                }
            } else {
                z = z2;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, wc0Var.e, wc0Var.f);
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putBoolean("android.support.allowGeneratedReplies", true);
            builder2.setAllowGeneratedReplies(true);
            boolean z3 = z;
            bundle3.putInt("android.support.action.semanticAction", z3 ? 1 : 0);
            builder2.setSemanticAction(z3 ? 1 : 0);
            builder2.setContextual(z3);
            if (Build.VERSION.SDK_INT >= 31) {
                or.b(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", wc0Var.c);
            builder2.addExtras(bundle3);
            builder.addAction(builder2.build());
            icon = notification2;
            z2 = false;
        }
        ?? r16 = icon;
        Bundle bundle4 = this.j;
        if (bundle4 != null) {
            bundle.putAll(bundle4);
        }
        builder.setShowWhen(true);
        builder.setLocalOnly(false);
        builder.setGroup(this.h);
        builder.setSortKey(r16);
        builder.setGroupSummary(false);
        builder.setCategory(this.i);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(r16);
        builder.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.m;
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                builder.addPerson((String) obj2);
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3.size() > 0) {
            Bundle bundle5 = this.j;
            if (bundle5 == null) {
                bundle5 = new Bundle();
                this.j = bundle5;
            }
            Bundle bundle6 = bundle5.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList3.size()) {
                String num = Integer.toString(i6);
                wc0 wc0Var2 = (wc0) arrayList3.get(i6);
                Bundle bundle9 = new Bundle();
                IconCompat iconCompat2 = wc0Var2.b;
                if (iconCompat2 == null && (i = wc0Var2.d) != 0) {
                    iconCompat2 = IconCompat.a(i);
                    wc0Var2.b = iconCompat2;
                }
                Bundle bundle10 = wc0Var2.a;
                ArrayList arrayList4 = arrayList3;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle9.putCharSequence("title", wc0Var2.e);
                bundle9.putParcelable("actionIntent", wc0Var2.f);
                Bundle bundle11 = new Bundle(bundle10);
                bundle11.putBoolean("android.support.allowGeneratedReplies", true);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", wc0Var2.c);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i6++;
                arrayList3 = arrayList4;
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            Bundle bundle12 = this.j;
            if (bundle12 == null) {
                bundle12 = new Bundle();
                this.j = bundle12;
            }
            bundle12.putBundle("android.car.EXTENSIONS", bundle6);
            bundle.putBundle("android.car.EXTENSIONS", bundle7);
        }
        builder.setExtras(this.j);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(str2)) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it = this.c.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        builder.setAllowSystemGeneratedContextualActions(true);
        builder.setBubbleMetadata(null);
        return builder.build();
    }

    public final void c() {
        this.l.flags |= 2;
    }
}
